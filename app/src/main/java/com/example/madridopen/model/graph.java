package com.example.madridopen.model;

public class graph {

        private String id;

        private String type;

        private String title;

        private String description;

        private int price;

        private String dtstart;

        private String dtend;

        private String excludeddays;

        private Recurrence recurrence;

        private String uid;

        private String link;

        private String eventlocation;

        private References references;

        private Relation relation;

        private Address address;

        private Location location;

        public void setid(String id){
        this.id = id;
    }
        public String getid(){
        return this.id;
    }
        public void settype(String type){
        this.type = type;
    }
        public String gettype(){
        return this.type;
    }
        public void setId(String id){
        this.id = id;
    }
        public String getId(){
        return this.id;
    }
        public void setTitle(String title){
        this.title = title;
    }
        public String getTitle(){
        return this.title;
    }
        public void setDescription(String description){
        this.description = description;
    }
        public String getDescription(){
        return this.description;
    }
        public void setPrice(int price){
        this.price = price;
    }
        public int getPrice(){
        return this.price;
    }
        public void setDtstart(String dtstart){
        this.dtstart = dtstart;
    }
        public String getDtstart(){
        return this.dtstart;
    }
        public void setDtend(String dtend){
        this.dtend = dtend;
    }
        public String getDtend(){
        return this.dtend;
    }
        public void setExcludeddays(String excludeddays){
        this.excludeddays = excludeddays;
    }
        public String getExcludeddays(){
        return this.excludeddays;
    }
        public void setRecurrence(Recurrence recurrence){
        this.recurrence = recurrence;
    }
        public Recurrence getRecurrence(){
        return this.recurrence;
    }
        public void setUid(String uid){
        this.uid = uid;
    }
        public String getUid(){
        return this.uid;
    }
        public void setLink(String link){
        this.link = link;
    }
        public String getLink(){
        return this.link;
    }
        public void setEventlocation(String eventlocation){
        this.eventlocation = eventlocation;
    }
        public String getEventlocation(){
        return this.eventlocation;
    }
        public void setReferences(References references){
        this.references = references;
    }
        public References getReferences(){
        return this.references;
    }
        public void setRelation(Relation relation){
        this.relation = relation;
    }
        public Relation getRelation(){
        return this.relation;
    }
        public void setAddress(Address address){
        this.address = address;
    }
        public Address getAddress(){
        return this.address;
    }
        public void setLocation(Location location){
        this.location = location;
    }
        public Location getLocation(){
        return this.location;
    }


}
