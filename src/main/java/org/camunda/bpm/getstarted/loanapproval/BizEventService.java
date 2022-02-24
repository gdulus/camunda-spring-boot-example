package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.value.StringValue;

import java.util.logging.Logger;

public class BizEventService implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger(BizEventService.class.getName());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        final StringValue messageType = delegateExecution.getVariableLocalTyped("message_type");
        final String messageTypeValue = messageType.getValue();
        final StringValue variable = delegateExecution.getVariableTyped("talent_name");
        final String variableValue = variable.getValue();
        LOGGER.info("Sending biz event " + messageTypeValue + " for talent " + variableValue);
    }
}
