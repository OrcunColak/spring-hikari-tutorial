The original idea is from  
https://medium.com/@eremeykin/how-to-deal-with-hikaricp-connection-leaks-part-1-1eddc135b464

# -------------------- Actuator --------------------

http://localhost:8080/actuator/metrics/hikaricp.connections.active
http://localhost:8080/actuator/metrics/hikaricp.connections.idle
http://localhost:8080/actuator/metrics/hikaricp.connections.max
http://localhost:8080/actuator/metrics/hikaricp.connections.min