package com.example.demo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

/*import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.AMQP.Connection.Close;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Method;
import com.rabbitmq.client.ShutdownListener;
import com.rabbitmq.client.ShutdownSignalException;*/



/**
 * @author Lakshmanan
 * 
 */

@Component
public class Receiver {

	/*
	 * private static final Logger logger = LoggerFactory.getLogger(Receiver.class);
	 * private int connectionCount = 0;
	 * 
	 * @Value("${consumer.listener.queue}") private String queueName;
	 * 
	 * @Value("${diheventservice.apiKey}") private String emailpublishApiKey;
	 * 
	 * @Value("${diheventservice.url}") private String emailpublishUrl;
	 * 
	 * @Value("${communicationChannels.url}") private String userEmailUrl;
	 * 
	 * @Value("${communicationChannels.apikey}") private String userEmailApiKey;
	 * 
	 * @Value("${testMailList}") private String testMail;
	 * 
	 * @Value("${log.user.uri}") private String logUserUri;
	 * 
	 * @Value("${log.user.apiKey}") private String logUserApiKey;
	 * 
	 * @Autowired Service service;
	 * 
	 * public Receiver() { // setting this so that we only add 1 ShutdownListener to
	 * the // connection. connectionCount = 1; }
	 * 
	 * @RabbitListener(queues = "${consumer.listener.queue}") public void
	 * receiveMessage(com.rabbitmq.client.Channel myChannel, String message) throws
	 * ListenerException { logger.info( "=======Receiver.receiveMessage()======>>>"
	 * + message ); long startTime = System.nanoTime(); // Default coding event
	 * listener if (connectionCount == 1) { // Need to get the connection so we can
	 * add a shutdown listener so // we can log out if/when a shutdown to a listener
	 * occurs Connection con = myChannel.getConnection(); addShutdownListener(con);
	 * connectionCount++; } eventProcess(message); long endTime = System.nanoTime();
	 * long duration = endTime - startTime; logger.info(
	 * "Total time of service call = " + duration / ListenerConstants.TOTAL_TIME);
	 * 
	 * }
	 * 
	 * void addShutdownListener(Connection con){ con.addShutdownListener(new
	 * ShutdownListener() { public void shutdownCompleted(ShutdownSignalException
	 * cause) { connectionCount = 1;
	 * logger.info("Connection to the listener was closed.  Cause = " +
	 * shutdownListenerError(cause)); } }); }
	 * 
	 * String shutdownListenerError(ShutdownSignalException cause){ logger.info(
	 * "Receiver:::shutdownListenerError():::Begin"); String reasonText =
	 * "The Channel was unexpectedly closed"; if (cause.isHardError()) { if
	 * (!cause.isInitiatedByApplication()) { Method reason = cause.getReason(); if
	 * (reason == null) { reasonText = cause.getMessage(); } else { if
	 * ("connection.close".equals(reason.protocolMethodName())){
	 * AMQP.Connection.Close connClose = (Close) reason; reasonText =
	 * connClose.getReplyText(); } else { AMQP.Channel.Close channelClose =
	 * (com.rabbitmq.client.AMQP.Channel.Close) reason; reasonText =
	 * channelClose.getReplyText(); } } } } return reasonText; }
	 * 
	 * void eventProcess(String message){ logger.info(
	 * "Receiver:::eventProcess():::Begin"); List<EmailAddresses> emailAddressesList
	 * = new ArrayList<>(); List<String> testMailList =
	 * Arrays.asList(testMail.split(":")); EventMessage eventMessage = null;
	 * ListenerInterface listenerInterface = new ListenerInterface(); String[]
	 * eventTypeIdList = ListenerConstants.EVENT_TYPE_ID.split(":"); HttpMethod
	 * httpMethod = HttpMethod.POST; try { eventMessage = new
	 * ObjectMapper().readValue(listenerInterface.convertJsonNode(message).toString(
	 * ),EventMessage.class); service.logUserDetails(logUserUri,eventMessage,
	 * logUserApiKey,httpMethod);
	 * eventMessage.setEventTypeId(Integer.parseInt(eventTypeIdList[0]));
	 * testMailList.forEach(email -> emailAddressesList.add(new
	 * EmailAddresses(email)));
	 * eventMessage.getEventData().setEmailAddresses(emailAddressesList);
	 * service.sendEmail(emailpublishUrl,eventMessage, emailpublishApiKey,
	 * httpMethod); httpMethod = HttpMethod.GET; JSONObject userDetails =
	 * service.getUserEmail(userEmailUrl,eventMessage,userEmailApiKey, httpMethod);
	 * CommunicationChannelsResponse communicationChannelsResponse = new
	 * ObjectMapper().readValue(userDetails.toString(),CommunicationChannelsResponse
	 * .class); emailAddressesList.clear(); emailAddressesList.add(new
	 * EmailAddresses(communicationChannelsResponse.getInformation().
	 * getCommunicationChannels().getEmailPreferences().get(0).getChannelValue()));
	 * httpMethod = HttpMethod.POST;
	 * eventMessage.setEventTypeId(Integer.parseInt(eventTypeIdList[1]));
	 * eventMessage.getEventData().setEmailAddresses(emailAddressesList);
	 * service.apiCall(new
	 * ObjectMapper().readValue(listenerInterface.convertJsonNode(new
	 * ObjectMapper().writeValueAsString(eventMessage)).toString(),JSONObject.class)
	 * , httpMethod, emailpublishUrl, emailpublishApiKey); } catch (Exception e) {
	 * logger.error( "Receiver:::eventProcess():::Exception Occured : " + e ); } }
	 */}
