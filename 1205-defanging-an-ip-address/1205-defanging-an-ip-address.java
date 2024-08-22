class Solution {
    public String defangIPaddr(String address) {
        
        String r=address.replace(".","[.]");
        return r;
    }
}