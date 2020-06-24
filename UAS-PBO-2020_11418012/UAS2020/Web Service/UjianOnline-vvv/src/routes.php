<?php

use Slim\App;
use Slim\Http\Request;
use Slim\Http\Response;

return function (App $app) {
    $container = $app->getContainer();

    $app->get('/[{name}]', function (Request $request, Response $response, array $args) use ($container) {
        // Sample log message
        $container->get('logger')->info("Slim-Skeleton '/' route");

        // Render index view
        return $container->get('renderer')->render($response, 'index.phtml', $args);
    });

    $app->get("/kuis/", function (Request $request, Response $response){
        $sql = "SELECT * FROM kuis";
        $stmt = $this->db->prepare($sql);
        $stmt->execute();
        $result = $stmt->fetchAll();
        return $response->withJson(["status" => "success", "data" => $result], 200);
    });

    $app->post("/login/", function(Request $request, Response $response){
        $data = $request->getParsedBody();
        $username = $data['username'];
        $password = $data['password'];
        $sql = "select * from peserta where username=:username AND password=:password";
        $stmt = $this->db->prepare($sql);
        $stmt->bindParam("username", $username);
        $stmt->bindParam("password", $password);
        $stmt->execute();
        $result = $stmt->fetchAll();
        if(sizeof($result)==0){//apabila data peserta tidak ditemukan
            return $response->withJson(["status" => "error", "message" => "Username dan password tidak ditemukan"], 200);
        }
        else {
            return $response->withJson(["status" => "success", "data" => $result], 200);
        }
    });

    $app->get("/login/{id_peserta}", function (Request $request, Response $response, $args){
        $id = $args["id_peserta"];
        $sql = "INSERT INTO info_login VALUES(:id, NOW())";
        $stmt = $this->db->prepare($sql);
        $stmt->bindParam("id", $id);
        $stmt->execute();
        return $response->withJson(["status" => "success"], 200);
    });

    $app->get("/soalkuis/{id_kuis}", function (Request $request, Response $response, $args){
        $id_kuis = $args["id_kuis"];
        $sql = "SELECT sk.id_soal, bs.pertanyaan, bs.jawaban 
                FROM soal_kuis sk
                JOIN bank_soal bs
                ON sk.id_soal = bs.id_soal
                WHERE id_kuis =:id";
        $stmt = $this->db->prepare($sql);
        $stmt->bindParam("id", $id_kuis);
        $stmt->execute();
        $result = $stmt->fetchAll();
        return $response->withJson(["status" => "success", "data" => $result], 200);
    });

    $app->post("/kuis/jawaban", function(Request $request, Response $response){
        $data = $request->getParsedBody();
        $id_peserta = $data['id_peserta'];
        $id_soalkuis = $data['id_soalkuis'];
        $jawaban_peserta = $data['jawaban_peserta'];
        $sql = "INSERT INTO jawaban_peserta values(:id_peserta, :id_soalkuis, :jawaban_peserta)";
        $stmt = $this->db->prepare($sql);
        $stmt->bindParam("id_peserta", $id_peserta);
        $stmt->bindParam("id_soalkuis", $id_soalkuis);
        $stmt->bindParam("jawaban_peserta", $jawaban_peserta);
        $stmt->execute();
        return $response->withJson(["status" => "success"], 200);

    });
};
