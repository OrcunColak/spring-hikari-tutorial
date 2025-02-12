The original idea is from  
https://medium.com/@eremeykin/how-to-deal-with-hikaricp-connection-leaks-part-1-1eddc135b464

# Actuator

http://localhost:8080/actuator/metrics/hikaricp.connections.active
http://localhost:8080/actuator/metrics/hikaricp.connections.idle
http://localhost:8080/actuator/metrics/hikaricp.connections.max
http://localhost:8080/actuator/metrics/hikaricp.connections.min

# Common Connection Pool Errors with HikariCP
https://medium.com/@nagarjun_nagesh/common-connection-pool-errors-with-hikaricp-in-spring-boot-6d15ecc0ccab  
1. **Connection is not available, request timed out after...**
  This error occurs when the connection pool is exhausted, meaning all available connections are in use, and no new connections are available within the specified timeout period.

2. **HikariPool-1 - Connection is not valid...**
   This error indicates that HikariCP is unable to validate a connection when trying to retrieve it from the pool. It might happen if the database connection has been closed or is otherwise invalid.

3. **Failed to initialize pool: Communications link failure**
   This error occurs when the connection pool fails to initialize due to the inability to establish a connection with the database server.

   
