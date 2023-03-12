public class cTivi {
  private String[] channelList;
  Boolean isOn;
  String currentChannel;

  public cTivi() {
    isOn = false;
    channelList = new String[] { "VTV1", "VTV2", "VTV3" };
    currentChannel = "VTV1";

  }

  public cTivi(String[] channels) {
    this.channelList = channels;
    this.isOn = false;
    this.currentChannel = channelList[0];
  }

  private String searchNextChannel(Boolean isForward) {
    int currentIndex = 0;
    for (int i = 0; i < channelList.length; i++) {
      if (channelList[i] == currentChannel) {
        currentIndex = i;
        break;
      }
      if (isForward) {
        currentIndex = (currentIndex + 1) % channelList.length;
      } else {
        currentIndex--;
        if (currentIndex < 0) {
          currentIndex = channelList.length - 1;
        }
      }
    }
    return channelList[currentIndex];

  }

  private void On() {
    isOn = true;
    System.out.println("---TV On---");
  }

  private void Off() {
    isOn = false;
    System.out.println("---TV Off---");
  }

  private void Switch() {
    if (isOn) {
      Off();
    } else {
      On();
    }
  }

  private void Switch(String channel) {
    if (isOn) {
      for (int i = 0; i < channelList.length; i++) {
        if (channelList.equals(channel)) {
          currentChannel=channelList[i];
          System.out.println("Switched to channel "+currentChannel);
          return;
        }
      }
      System.out.println("Channel "+channel+" not found");
    }else{
      System.out.println("Tv is off");
    }
  }
  private void nextChannel() {
    if (isOn) {
      for (int i = 0; i < channelList.length; i++) {
        if (channelList.equals(currentChannel)) {
          
          currentChannel=channelList[i+1];
          break;
        }
      }
      System.out.println(currentChannel);
    }
  }
  private void previousChannel() {
    if (isOn) {
      for (int i = 0; i < channelList.length; i++) {
        if (channelList.equals(currentChannel)) {
          
          currentChannel=channelList[i-1];
          break;
        }
      }
      System.out.println(currentChannel);
    }
  }
  private void Show() {
    if (isOn) {
      System.out.println("Tv is on at channel: "+currentChannel);
    } else {
      System.out.println("Tv is off");
    }
  }
}