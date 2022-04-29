package com.example.talasalitaan.Model;

public class firstbootsystem {

    int scenes = 0;
    int loadornew = 0;
    private static String LoadUserProfile = "Loading User Profile";
    private static String NoProfileDetected = "No saved profile detected";
    private static String CreateNewUser = "Create a new user profile";
    private static String CreateOrLearn = "Create a new user profile or Learn a new Dialect";
    private static String PickDialect = "Pick a dialect";

    public firstbootsystem(){}

    public int getScene() { return scenes; }
    public void setScene(int scene) { this.scenes = scene; }
    public int getloadornew() {return loadornew; }
    public void setloadornew(int loadornew) { this.loadornew = loadornew; }


}
