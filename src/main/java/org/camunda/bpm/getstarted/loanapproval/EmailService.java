package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.value.StringValue;

import java.util.logging.Logger;

public class EmailService implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger(EmailService.class.getName());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        final StringValue emailType = delegateExecution.getVariableTyped("email_type");
        LOGGER.info("Sending email " + emailType.getValue());
    }
}
