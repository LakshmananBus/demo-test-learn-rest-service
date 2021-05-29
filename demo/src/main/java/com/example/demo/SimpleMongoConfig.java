package com.example.demo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleMongoConfig {
	/*
	 * private String conn =
	 * "mongodb+srv://lakshmanan:MC5hOPrUdmEMHfI0@cluster0.4zjgj.mongodb.net/demo?retryWrites=true&w=majority";
	 * 
	 * public String getDatabaseName() { return "demo"; } //@Bean //@Order(value =
	 * 1) public MongoClient mongoClient() {
	 * 
	 * 
	 * ConnectionString connectionString = new ConnectionString(conn);
	 * MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
	 * .applyConnectionString(connectionString) .build();
	 * 
	 * return (MongoClient) MongoClients.create(mongoClientSettings);
	 * 
	 * //return client; } //@Bean //@Order(value = 2) public MongoDbFactory
	 * mongoDbFactory() { MongoDbFactory factory = new
	 * SimpleMongoDbFactory(mongoClient(), getDatabaseName()); return factory; }
	 * //@Bean //@Order(value = 3) public MongoTemplate mongoTemplate() {
	 * MongoClientURI connectionString = new MongoClientURI(conn); MongoClient
	 * mongoClient = new MongoClient(connectionString); MongoTemplate template = new
	 * MongoTemplate(mongoClient,"demo"); return template; }
	 */}