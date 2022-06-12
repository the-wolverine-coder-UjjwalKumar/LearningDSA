public class AuthenticationManagerLeetcode1797 {

    private Map<String, Integer> expiry = new LinkedHashMap<>(16, 0.75F, true); // here true indicates the map entries are in access order.
    private int life;
    
    public AuthenticationManager(int timeToLive) {
        life = timeToLive;
    }
    
    public void generate(String tokenId, int currentTime) {
        evictExpired(currentTime);
        expiry.put(tokenId, life + currentTime);
    }
    
    public void renew(String tokenId, int currentTime) {
        evictExpired(currentTime);
        if (expiry.containsKey(tokenId)) {
            expiry.put(tokenId, life + currentTime);
        }
    }
    
    public int countUnexpiredTokens(int currentTime) {
        evictExpired(currentTime);
        return expiry.size();
    }
    
    private void evictExpired(int currentTime) {
        var iter = expiry.entrySet().iterator();
        while (iter.hasNext() && iter.next().getValue() <= currentTime) {
            iter.remove();
        }
    }
}
