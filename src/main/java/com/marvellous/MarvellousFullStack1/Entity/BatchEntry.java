package com.marvellous.MarvellousFullStack1.Entity;

//import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Data
@Getter
@Setter
@Document(collection = "BatchDetails")
public class BatchEntry {
        @Id
        private String id;
        private String batchName;
        private String duration;
        private double fees;

        //Constructors
        public BatchEntry(){}

        public BatchEntry(String batchName, String duration, double fees)
        {
            this.batchName = batchName;
            this.duration = duration;
            this.fees = fees;
        }

        //Getters and Setters
        // (Used for encapsulation and JSON mapping
}
