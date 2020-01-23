package backEnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class APITest {

    public static String body (HttpURLConnection con) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine.trim());
        }
        in.close();
       return response.toString();
    }


    public static void main(String[] args) throws Exception {
        String item = "Iphone";
        try {
            URL url = new URL("https://api.mercadolibre.com/sites/MLA/search?q="+ item);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);

            String response = body(con);

            Gson gson = new Gson();
            ResponsePayload result = gson.fromJson(response, ResponsePayload.class);

            int responseCode = con.getResponseCode();
            System.out.println("Sending 'GET' request to API : " + url);
            System.out.println("Response Code : " + responseCode);
            System.out.println(result.paging);
            System.out.println("------items found------");
            for (ResponsePayload.Result r: result.results) {
               System.out.println(" Title :" + r.title);
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


