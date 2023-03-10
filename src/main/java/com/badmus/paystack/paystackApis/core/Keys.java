package com.badmus.paystack.paystackApis.core;

import lombok.Getter;
import lombok.Setter;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Getter
@Setter
public class Keys {
    private String TEST_SECRET_KEY;
    private String TEST_PUBLIC_KEY;
    private String LIVE_SECRET_KEY;
    private String LIVE_PUBLIC_KEY;
    String KEY_IN_USE;

    /**
     * Used to initialise all necessary API keys
     *
     * @throws FileNotFoundException
     */
    void initKeysOLD() throws FileNotFoundException {
        JSONObject keyObject;
        String fileContent = "";
        File file = new File("Keys.json");
        Scanner scanner = new Scanner(file);


        while (scanner.hasNext()) {
            fileContent += scanner.nextLine();
        }
        keyObject = new JSONObject(fileContent).getJSONObject("API_KEYS");

        this.KEY_IN_USE = keyObject.getString("KEY_IN_USE");
        this.TEST_SECRET_KEY = keyObject.getString("TEST_SECRET_KEY");
        this.TEST_PUBLIC_KEY = keyObject.getString("TEST_PUBLIC_KEY");
        this.LIVE_SECRET_KEY = keyObject.getString("LIVE_SECRET_KEY");
        this.LIVE_PUBLIC_KEY = keyObject.getString("LIVE_PUBLIC_KEY");

    }

    void initKeys() throws FileNotFoundException {
        JSONObject keyObject;
        String fileContent = "";
//        File file = new File("Keys.json");
//        System.out.println("File Pth = "+file.getPath());
//        InputStream istream = getClass().getClassLoader().getResourceAsStream("Keys.json");
//        Scanner scanner = new Scanner(file);

//        while (scanner.hasNext()) {
//            fileContent += scanner.nextLine();
//        }
//        keyObject = new JSONObject(fileContent).getJSONObject("API_KEYS");

        this.KEY_IN_USE = "sk_test_627e02df4c7884bdf9161f0f613ba92c409ba1ea";
//        this.TEST_SECRET_KEY = keyObject.getString("TEST_SECRET_KEY");
//        this.TEST_PUBLIC_KEY = keyObject.getString("TEST_PUBLIC_KEY");
//        this.LIVE_SECRET_KEY = keyObject.getString("LIVE_SECRET_KEY");
//        this.LIVE_PUBLIC_KEY = keyObject.getString("LIVE_PUBLIC_KEY");

    }

    /**
     * Used to set test secret key
     *
     * @param key
     */
    protected void setTest_SECRET_KEY(String key) {
        this.TEST_SECRET_KEY = key;
    }

    /**
     * Used to get test secret key
     *
     * @return
     */
    protected String getTEST_SECRET_KEY() {
        return this.TEST_SECRET_KEY;
    }

    /**
     * Used to set test public key
     *
     * @param key
     */
    protected void setTEST_PUBLIC_KEY(String key) {
        this.TEST_PUBLIC_KEY = key;
    }

    /**
     * Used to get test public key
     *
     * @return
     */
    protected String getTEST_PUBLIC_KEY() {
        return this.TEST_PUBLIC_KEY;
    }

    /**
     * Used to set live secret key
     *
     * @param key
     */
    protected void setLIVE_SECRET_KEY(String key) {
        this.LIVE_SECRET_KEY = key;
    }

    /**
     * Used to get live secret key
     *
     * @return
     */
    protected String getLIVE_SECRET_KEY() {
        return this.LIVE_SECRET_KEY;
    }

    /**
     * Used to set live public key
     *
     * @param key
     */
    protected void setLIVE_PUBLIC_KEY(String key) {
        this.LIVE_PUBLIC_KEY = key;
    }

    /**
     * Used to get live public key
     *
     * @return
     */
    protected String getLIVE_PUBLIC_KEY() {
        return this.LIVE_PUBLIC_KEY;
    }
}
