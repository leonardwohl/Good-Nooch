package com.leonardwohl.goodnooch;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Len Wohl on 4/30/2017.
 */

public class NutritionManager {

    private static ArrayList<NutritionItem> nutritionItems; //All items
    private static NutritionItem nutritionSum; //Daily totals
    private static Calendar date; // date

    public NutritionItem newItem(){
        NutritionItem item = new NutritionItem();
        nutritionItems.add(item);
        return item;
    }
    /*
    private File getFile(){

        Calendar calendar = Calendar.getInstance();
        String year = Integer.toString(calendar.get(Calendar.YEAR));
        String month = Integer.toString(calendar.get(Calendar.MONTH));
        String day = Integer.toString(calendar.get(Calendar.DAY_OF_MONTH));
        Context context = this;
        //filename will be year month day with no spaces
        String filename = year + month + day + ".txt";
        File file = new File(context.getFilesDir(), filename);
        return file;

    }

    private void fileSystem() {
        Calendar calendar = Calendar.getInstance();
        String year = Integer.toString(calendar.get(Calendar.YEAR));
        String month = Integer.toString(calendar.get(Calendar.MONTH));
        String day = Integer.toString(calendar.get(Calendar.DAY_OF_MONTH));
        Context context = this;
        //filename will be year month day with no spaces
        String filename = year + month + day + ".txt";
        File file = new File(context.getFilesDir(), filename);
        if (file.exists()) {
            try {
                InputStream inputStream = context.openFileInput(filename);

                if ( inputStream != null ) {
                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    String receiveString = "";
                    if ((receiveString = bufferedReader.readLine()) != null) {
                        total_stats.calories = stats.calories + Integer.parseInt(receiveString);
                    }
                    if ((receiveString = bufferedReader.readLine()) != null) {
                        total_stats.fat = stats.fat + Integer.parseInt(receiveString);
                    }
                    if ((receiveString = bufferedReader.readLine()) != null) {
                        total_stats.sat_fat = stats.sat_fat + Integer.parseInt(receiveString);
                    }
                    if ((receiveString = bufferedReader.readLine()) != null) {
                        total_stats.trans_fat = stats.trans_fat + Integer.parseInt(receiveString);
                    }
                    if ((receiveString = bufferedReader.readLine()) != null) {
                        total_stats.cholesteral = stats.cholesteral + Integer.parseInt(receiveString);
                    }
                    if ((receiveString = bufferedReader.readLine()) != null) {
                        total_stats.sodium = stats.sodium + Integer.parseInt(receiveString);
                    }
                    if ((receiveString = bufferedReader.readLine()) != null) {
                        total_stats.carbs = stats.carbs + Integer.parseInt(receiveString);
                    }
                    if ((receiveString = bufferedReader.readLine()) != null) {
                        total_stats.fiber = stats.fiber + Integer.parseInt(receiveString);
                    }
                    if ((receiveString = bufferedReader.readLine()) != null) {
                        total_stats.sugar = stats.sugar + Integer.parseInt(receiveString);
                    }
                    if ((receiveString = bufferedReader.readLine()) != null) {
                        total_stats.protein = stats.protein + Integer.parseInt(receiveString);
                    }
                    inputStream.close();
                    try {
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput(filename, Context.MODE_PRIVATE));
                        outputStreamWriter.write(total_stats.calories + "\n" +
                                total_stats.fat + "\n" +
                                total_stats.sat_fat + "\n" +
                                total_stats.trans_fat + "\n" +
                                total_stats.cholesteral + "\n" +
                                total_stats.sodium + "\n" +
                                total_stats.carbs + "\n" +
                                total_stats.fiber + "\n" +
                                total_stats.sugar + "\n" +
                                total_stats.protein + "\n");
                        outputStreamWriter.close();
                    }
                    catch (IOException e) {
                        Log.e("Exception", "File write failed: " + e.toString());
                    }
                }
            }
            catch (FileNotFoundException e) {
                Log.e("login activity", "File not found: " + e.toString());
            } catch (IOException e) {
                Log.e("login activity", "Can not read file: " + e.toString());
            }
        } else {
            //create file first time
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput(filename, Context.MODE_PRIVATE));
                outputStreamWriter.write(stats.calories + "\n" +
                        stats.fat + "\n" +
                        stats.sat_fat + "\n" +
                        stats.trans_fat + "\n" +
                        stats.cholesteral + "\n" +
                        stats.sodium + "\n" +
                        stats.carbs + "\n" +
                        stats.fiber + "\n" +
                        stats.sugar + "\n" +
                        stats.protein + "\n");
                outputStreamWriter.close();
            }
            catch (IOException e) {
                Log.e("Exception", "File write failed: " + e.toString());
            }
        }

        Intent intent = new Intent(this, CompleteActivity.class);
        startActivity(intent);
    }*/

}
