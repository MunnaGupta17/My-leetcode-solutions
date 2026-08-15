class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        // Character.getNumericValue()
        int startSeconds = 0, endSeconds = 0;
        // seconds added
        startSeconds += (Character.getNumericValue(startTime.charAt(6)) * 10)
                + Character.getNumericValue(startTime.charAt(7));
        // Minutes converded to seconds and added
        startSeconds += ((Character.getNumericValue(startTime.charAt(3)) * 10) * 60)
                + Character.getNumericValue(startTime.charAt(4)) * 60;
        // Hour converted to seconds and added
        startSeconds += (((Character.getNumericValue(startTime.charAt(0)) * 10) * 60) * 60) +
                (Character.getNumericValue(startTime.charAt(1)) * 60) * 60;

        // seconds added
        endSeconds += (Character.getNumericValue(endTime.charAt(6)) * 10)
                + Character.getNumericValue(endTime.charAt(7));
        // Minutes converded to seconds and added
        endSeconds += ((Character.getNumericValue(endTime.charAt(3)) * 10) * 60)
                + Character.getNumericValue(endTime.charAt(4)) * 60;
        // Hour converted to seconds and added
        endSeconds += (((Character.getNumericValue(endTime.charAt(0)) * 10) * 60) * 60) +
                (Character.getNumericValue(endTime.charAt(1)) * 60) * 60;

        return Math.abs(startSeconds - endSeconds);
    }
}