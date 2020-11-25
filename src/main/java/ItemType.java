public enum ItemType {
   AUDIO("AU"),
   VISUAL("VI"),
   AUDIO_MOBILE("AM"),
   VISUAL_MOBILE("VM")
   ;

   //public final String code;
   public String code;

   ItemType(String code) {
      this.code = code;
   }

   public String getType(){
      return code;
   }

/*
   @Override
   public String toString() {
      return code;
   }
*/
}

