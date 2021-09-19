package com.example.voumecontrol.controllers;

import com.example.voumecontrol.commandline.CommandWindows;
import com.example.voumecontrol.models.Command;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/command")
public class Controller {
    CommandWindows commandWindows = new CommandWindows();
    @PostMapping
    public ResponseEntity<Command> receiveCommand(@RequestBody Command command) throws IOException {
        System.out.println(command);
        commandWindows.volumeUpOrDown(command.getCommand());
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
