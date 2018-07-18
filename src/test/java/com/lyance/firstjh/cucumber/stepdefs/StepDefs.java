package com.lyance.firstjh.cucumber.stepdefs;

import com.lyance.firstjh.Jhipster2App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Jhipster2App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
