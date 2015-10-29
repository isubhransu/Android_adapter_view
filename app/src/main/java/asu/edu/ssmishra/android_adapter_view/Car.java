package asu.edu.ssmishra.android_adapter_view;

/**
 * Copyright 2015 Subhransu Mishra
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p/>
 * Purpose:
 *
 * @author Subhransu Mishra s.mishra@asu.edu
 *         MS Software Engineering, CIDSE, ASU
 * @version October 27 2015
 */
public class Car {
    private String make;
    private int year;
    private int iconID;

    public Car(String make, int year, int iconID, String condition) {
        this.make = make;
        this.year = year;
        this.iconID = iconID;
        this.condition = condition;
    }

    public String getMake() {
        return make;

    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIconID() {
        return iconID;
    }

    public void setIconID(int iconID) {
        this.iconID = iconID;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    private String condition;

}
