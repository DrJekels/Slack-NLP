package Slack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SlackAPI {

    private static String file_name = "resources/api-token.txt";

    private String api_key;

    private void setApi_Key(String file_name) {

        FileReader fr = null;
        BufferedReader br = null;

        try {

            fr = new FileReader(file_name);
            br = new BufferedReader(fr);

            String temp_key = br.readLine();

            this.api_key = temp_key;

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if(br != null) {
                    br.close();
                }

                if(fr != null) {
                    fr.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }

    public String getApi_key() { return api_key; }

}
