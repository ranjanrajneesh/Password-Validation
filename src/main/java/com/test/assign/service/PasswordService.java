package com.test.assign.service;

import java.util.List;

import com.test.assign.rule.RuleResult;

public interface PasswordService {
    /**
     * This method validates password using the rules configured in system
     *
     * @param password - password to be validated
     * @return collection of applied rule result
     */
    List<RuleResult> validate(String password);
}
