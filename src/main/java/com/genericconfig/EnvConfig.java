package com.genericconfig;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import io.restassured.RestAssured;

public class EnvConfig {
	public static String appUrl= "https://www.ebay.com";
	public static String jsonFileType;
	public static String usernameTextbox;
	public static String browser= "chrome";
	public static String xtrass;
}