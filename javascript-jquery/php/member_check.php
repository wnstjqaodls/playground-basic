<?php
header('Content-Type: application/json');

$response = array();
$email = $_POST['email'] ?? '';
$password = $_POST['password'] ?? '';

if ($email === "test@test.com" && $password === "1234") {
    $response['success'] = true;
    $response['message'] = "로그인 성공";
} else {
    $response['success'] = false;
    $response['message'] = "로그인 실패";
}

echo json_encode($response);
?>
