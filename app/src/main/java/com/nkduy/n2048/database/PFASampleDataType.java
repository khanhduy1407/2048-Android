/*
 * Copyright © 2021 NKDuy Developer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.nkduy.n2048.database;

public class PFASampleDataType {
    private int ID;
    private String DOMAIN;

    private String USERNAME;
    private int LENGTH;

    public PFASampleDataType() {
        //
    }

    /**
     * Always use this constructor to generate data with values.
     * @param ID The primary key for the database (will be automatically set by the DB)
     * @param DOMAIN Some sample String that could be in the DB
     * @param USERNAME Some sample String that could be in the DB
     * @param LENGTH Some sample int that could be in the DB
     */
    public PFASampleDataType(int ID, String DOMAIN, String USERNAME, int LENGTH) {
        this.ID=ID;
        this.DOMAIN=DOMAIN;
        this.USERNAME=USERNAME;
        this.LENGTH=LENGTH;
    }

    /**
     * All variables need getters and setters. because the variables are private.
     */
    public int getLENGTH() {
        return LENGTH;
    }

    public void setLENGTH(int LENGTH) {
        this.LENGTH = LENGTH;
    }

    public String getDOMAIN() {
        return DOMAIN;
    }

    public void setDOMAIN(String DOMAIN) {
        this.DOMAIN = DOMAIN;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }
}
