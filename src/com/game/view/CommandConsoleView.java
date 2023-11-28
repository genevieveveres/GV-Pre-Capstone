package com.game.view;

import com.game.view.framework.InputCollector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CommandConsoleView extends ConsoleView{
    private Map<String, java.util.List<String>> commands = new TreeMap<>();
    private List<String> entities = new ArrayList<>();
    private List<String> ignoreList = new ArrayList<>();
    private List<String> standaloneCommands = new ArrayList<>();
    private String escapeCommand = "quit";

    public CommandConsoleView(List<ConsoleText> text, Map<String, List<String>> commands, List<String> standaloneCommands, List<String> entities, List<String> ignoreList, String escapeCommand) {
        //super(text.toArray(new ConsoleText[0]));
        super(text);
        this.commands = commands;
        this.entities = entities;
        this.ignoreList = ignoreList;
        this.standaloneCommands = standaloneCommands;
    }


    @Override
    String collectInput() {
        return InputCollector.collectInput(commands, standaloneCommands, entities, ignoreList, escapeCommand);
    }
}
