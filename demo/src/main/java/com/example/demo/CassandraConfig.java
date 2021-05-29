package com.example.demo;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;


import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.JdkSSLOptions;
import com.datastax.driver.core.QueryOptions;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.policies.DCAwareRoundRobinPolicy;
import com.datastax.driver.core.policies.TokenAwarePolicy;
import com.datastax.driver.dse.auth.DsePlainTextAuthProvider;*/

@Configuration
public class CassandraConfig {

	/*
	 * 
	 * private static final Logger LOGGER =
	 * LoggerFactory.getLogger(CassandraConfig.class);
	 * 
	 * @Value("${db.contactpoints.list}") private String[] contactpoints;
	 * 
	 * @Value("${db.keyspace}") private String keySpace;
	 * 
	 * @Value("${db.username}") private String username;
	 * 
	 * @Value("${db.password}") private String password;
	 * 
	 * @Value("${db.region}") private String dbRegion;
	 * 
	 * @Value("${db.port}") private String port;
	 * 
	 * @Value("${keystore.file}") private String keyStore;
	 * 
	 * @Value("${keystore.pw}") private String keyStorePw;
	 * 
	 * @Value("${db.datacenter.local}") private String localDataCenter;
	 * 
	 * @Value("${apiRetryMaxCount}") private int retryMaxCount;
	 * 
	 * @Value("${apiRetrySleepTime}") private int retrySleepTime;
	 * 
	 * private Session session = null;
	 * 
	 * @Bean public CassandraOperations cassandraTemplate() throws ListenerException
	 * { if(session == null) { Cluster cluster =
	 * getCluster(keyStore,keyStorePw,contactpoints); session =
	 * cluster.connect(keySpace); } if(session != null) { return new
	 * CassandraTemplate(session) ; } return null; }
	 * 
	 * 
	 *//*************************************************************************
		 *
		 * Connects to Cassandra database. If there is already a cluster and a session
		 * then just reuse them.
		 * 
		 * @param
		 * @return void
		 * @throws Exception
		 * 
		 *************************************************************************/
	/*
	 * @SuppressWarnings("deprecation") private Cluster getCluster(String
	 * trustStoreLocation, String trustStorePassword, String[] host) throws
	 * ListenerException { Cluster cluster = null; SSLContext sslcontext = null;
	 * String exceptionMessage = "Exception connecting to Cassandra:";
	 * 
	 * try { InputStream inputStream =
	 * getClass().getClassLoader().getResourceAsStream(trustStoreLocation); KeyStore
	 * keystore = KeyStore.getInstance("jks");
	 * 
	 * keystore.load(inputStream, trustStorePassword.toCharArray());
	 * 
	 * TrustManagerFactory tmf =
	 * TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
	 * tmf.init(keystore); TrustManager[] tm = tmf.getTrustManagers();
	 * 
	 * sslcontext = SSLContext.getInstance("TLS"); sslcontext.init(null, tm, null);
	 * 
	 * JdkSSLOptions sslOptions =
	 * JdkSSLOptions.builder().withSSLContext(sslcontext).build();
	 * 
	 * cluster =
	 * Cluster.builder().addContactPoints(host).withSSL(sslOptions).withPort(Integer
	 * .parseInt(port)) .withAuthProvider(new DsePlainTextAuthProvider(username,
	 * password)) .withQueryOptions(new
	 * QueryOptions().setConsistencyLevel(ConsistencyLevel.ONE))
	 * .withLoadBalancingPolicy(new
	 * TokenAwarePolicy(DCAwareRoundRobinPolicy.builder().withLocalDc(
	 * localDataCenter) .withUsedHostsPerRemoteDc(ListenerConstants.HOST_VALUE).
	 * allowRemoteDCsForLocalConsistencyLevel().build())).build(); } catch
	 * (KeyStoreException keyStoreException) {
	 * LOGGER.error(exceptionMessage,keyStoreException.getMessage()); throw new
	 * ListenerException(exceptionMessage,keyStoreException); } catch
	 * (NoSuchAlgorithmException e) { LOGGER.error(exceptionMessage,e.getMessage());
	 * throw new ListenerException(exceptionMessage,e); } catch
	 * (CertificateException e) { LOGGER.error(exceptionMessage,e.getMessage());
	 * throw new ListenerException(exceptionMessage,e); } catch (IOException e) {
	 * LOGGER.error(exceptionMessage,e.getMessage()); throw new
	 * ListenerException(exceptionMessage,e); } catch (KeyManagementException e) {
	 * LOGGER.error(exceptionMessage,e.getMessage()); throw new
	 * ListenerException(exceptionMessage,e); } return cluster; }
	 */}
