package me.whyauthentic.javautils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class PastebinHelper {
    public static String paste(String content, String pasteName, String apiDevKey, String pasteExpireDate, String privateOption, String apiUserKey, String pasteFormat) throws IOException {
        String url = "https://pastebin.com/api/api_post.php";
        String apiOption = "paste";

        String parameters = "api_dev_key=" + URLEncoder.encode(apiDevKey, "UTF-8") +
                "&api_option=" + URLEncoder.encode(apiOption, "UTF-8") +
                "&api_paste_code=" + URLEncoder.encode(content, "UTF-8") +
                "&api_paste_private=" + URLEncoder.encode(privateOption, "UTF-8") +
                "&api_paste_name=" + URLEncoder.encode(pasteName, "UTF-8") +
                "&api_paste_expire_date=" + URLEncoder.encode(pasteExpireDate, "UTF-8") +
                "&api_paste_format=" + URLEncoder.encode(pasteFormat, "UTF-8") +
                "&api_user_key=" + URLEncoder.encode(apiUserKey, "UTF-8");

        URL apiUrl = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);

        DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
        outputStream.writeBytes(parameters);
        outputStream.flush();
        outputStream.close();

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        return response.toString();
    }

    public static String logintoken (String dev_key, String username, String password) throws IOException {

        String url = "https://pastebin.com/api/api_login.php";

        String parameters = "api_dev_key=" + URLEncoder.encode(dev_key, "UTF-8") +
                "&api_user_name=" + URLEncoder.encode(username, "UTF-8") +
                "&api_user_password=" + URLEncoder.encode(password, "UTF-8");


        URL apiUrl = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);

        DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
        outputStream.writeBytes(parameters);
        outputStream.flush();
        outputStream.close();

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        return response.toString();
    }
}
