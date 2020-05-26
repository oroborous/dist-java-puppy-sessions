package edu.wctc.sessiontest;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@Data
@Slf4j
public class Puppy {

    private String name;
    private int slippersChewed;

    public Puppy() {
        log.info("Creating Puppy");
    }

    public Puppy(String name, int slippersChewed) {
        log.info("Creating Puppy");
        this.name = name;
        this.slippersChewed = slippersChewed;
    }

    public void chewSlipper() {
        this.slippersChewed++;
    }

    public String toString() {
        return "Puppy named: " + name + ", Slippers chewed: " + slippersChewed;
    }
}
