package com.leonardwohl.goodnooch;

import com.google.api.services.vision.v1.model.BatchAnnotateImagesResponse;
import com.google.api.services.vision.v1.model.EntityAnnotation;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Len Wohl on 4/26/2017.
 */

public class NutritionItem {

    Calendar date;
    int calories;
    int fat;
    int sat_fat;
    int trans_fat;
    int cholesteral;
    int sodium;
    int carbs;
    int fiber;
    int sugar;
    int protein;

    NutritionItem() {

        date = Calendar.getInstance();
        calories = 0;
        fat = 0;
        sat_fat = 0;
        trans_fat = 0;
        cholesteral = 0;
        sodium = 0;
        carbs = 0;
        fiber = 0;
        sugar = 0;
        protein = 0;
    }

    public void buildNutritionItemFromResponse(BatchAnnotateImagesResponse response) {

        List<EntityAnnotation> labels = response.getResponses().get(0).getTextAnnotations();
        if (labels != null) {
            int total = 0;
            for (int i = 1; i < labels.size(); i++) {
                if (labels.get(i).getDescription().toLowerCase().equals("calories")) {
                    i++;
                    total = 0;
                    for (int j = 0; j < labels.get(i).getDescription().length(); j++) {
                        if (Character.isDigit(labels.get(i).getDescription().charAt(j))) {
                            total *= 10;
                            total += Character.getNumericValue(labels.get(i).getDescription().charAt(j));
                        } else {
                            break;
                        }
                    }
                    if (this.calories == 0) {
                        this.calories = total;
                    }
                }
                if (labels.get(i).getDescription().toLowerCase().equals("total")) {
                    i++;
                    if (labels.get(i).getDescription().toLowerCase().equals("fat")) {
                        i++;
                        total = 0;
                        for (int j = 0; j < labels.get(i).getDescription().length(); j++) {
                            if (Character.isDigit(labels.get(i).getDescription().charAt(j))) {
                                total *= 10;
                                total += Character.getNumericValue(labels.get(i).getDescription().charAt(j));
                            } else {
                                break;
                            }
                        }
                        if (this.fat == 0) {
                            this.fat = total;
                        }
                    }
                }
                if (labels.get(i).getDescription().toLowerCase().equals("saturated")) {
                    i++;
                    total = 0;
                    for (int j = 0; j < labels.get(i).getDescription().length(); j++) {
                        if (Character.isDigit(labels.get(i).getDescription().charAt(j))) {
                            total *= 10;
                            total += Character.getNumericValue(labels.get(i).getDescription().charAt(j));
                        } else {
                            break;
                        }
                    }
                    if (this.sat_fat == 0) {
                        this.sat_fat = total;
                    }
                }
                if (labels.get(i).getDescription().toLowerCase().equals("trans")) {
                    i++;
                    total = 0;
                    for (int j = 0; j < labels.get(i).getDescription().length(); j++) {
                        if (Character.isDigit(labels.get(i).getDescription().charAt(j))) {
                            total *= 10;
                            total += Character.getNumericValue(labels.get(i).getDescription().charAt(j));
                        } else {
                            break;
                        }
                    }
                    if (this.trans_fat == 0) {
                        this.trans_fat = total;
                    }
                }
                if (labels.get(i).getDescription().toLowerCase().equals("cholesterol")) {
                    i++;
                    total = 0;
                    for (int j = 0; j < labels.get(i).getDescription().length(); j++) {
                        if (Character.isDigit(labels.get(i).getDescription().charAt(j))) {
                            total *= 10;
                            total += Character.getNumericValue(labels.get(i).getDescription().charAt(j));
                        } else {
                            break;
                        }
                    }
                    if (this.cholesteral == 0) {
                        this.cholesteral = total;
                    }
                }
                if (labels.get(i).getDescription().toLowerCase().equals("sodium")) {
                    i++;
                    total = 0;
                    for (int j = 0; j < labels.get(i).getDescription().length(); j++) {
                        if (Character.isDigit(labels.get(i).getDescription().charAt(j))) {
                            total *= 10;
                            total += Character.getNumericValue(labels.get(i).getDescription().charAt(j));
                        } else {
                            break;
                        }
                    }
                    if (this.sodium == 0) {
                        this.sodium = total;
                    }
                }
                if (labels.get(i).getDescription().toLowerCase().equals("carbohydrate")) {
                    i++;
                    total = 0;
                    for (int j = 0; j < labels.get(i).getDescription().length(); j++) {
                        if (Character.isDigit(labels.get(i).getDescription().charAt(j))) {
                            total *= 10;
                            total += Character.getNumericValue(labels.get(i).getDescription().charAt(j));
                        } else {
                            break;
                        }
                    }
                    if (this.carbs == 0) {
                        this.carbs = total;
                    }
                }
                if (labels.get(i).getDescription().toLowerCase().equals("fiber")) {
                    i++;
                    total = 0;
                    for (int j = 0; j < labels.get(i).getDescription().length(); j++) {
                        if (Character.isDigit(labels.get(i).getDescription().charAt(j))) {
                            total *= 10;
                            total += Character.getNumericValue(labels.get(i).getDescription().charAt(j));
                        } else {
                            break;
                        }
                    }
                    if (this.fiber == 0) {
                        this.fiber = total;
                    }
                }
                if (labels.get(i).getDescription().toLowerCase().equals("sugars")) {
                    i++;
                    total = 0;
                    for (int j = 0; j < labels.get(i).getDescription().length(); j++) {
                        if (Character.isDigit(labels.get(i).getDescription().charAt(j))) {
                            total *= 10;
                            total += Character.getNumericValue(labels.get(i).getDescription().charAt(j));
                        } else {
                            break;
                        }
                    }
                    if (this.sugar == 0) {
                        this.sugar = total;
                    }
                }
                if (labels.get(i).getDescription().toLowerCase().equals("protein")) {
                    i++;
                    total = 0;
                    for (int j = 0; j < labels.get(i).getDescription().length(); j++) {
                        if (Character.isDigit(labels.get(i).getDescription().charAt(j))) {
                            total *= 10;
                            total += Character.getNumericValue(labels.get(i).getDescription().charAt(j));
                        } else {
                            break;
                        }
                    }
                    if (this.protein == 0) {
                        this.protein = total;
                    }
                }
            }
        }
    }
}
