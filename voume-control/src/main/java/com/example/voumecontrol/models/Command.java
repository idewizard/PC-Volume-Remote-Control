package com.example.voumecontrol.models;

import lombok.Getter;

@Getter
public class Command {
    private String command;

    @Override
    public String toString() {
        return "Command{" +
                "command='" + command + '\'' +
                '}';
    }
}
