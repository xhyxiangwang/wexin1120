package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.os.ResultReceiver;

public final class MediaBrowserCompat
{
  private static class ItemReceiver
    extends ResultReceiver
  {
    protected final void onReceiveResult(int paramInt, Bundle paramBundle)
    {
      paramBundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
      if ((paramInt != 0) || (paramBundle == null) || (!paramBundle.containsKey("media_item"))) {
        return;
      }
      paramBundle.getParcelable("media_item");
    }
  }
  
  public static class MediaItem
    implements Parcelable
  {
    public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator() {};
    private final MediaDescriptionCompat tA;
    private final int tz;
    
    public MediaItem(Parcel paramParcel)
    {
      this.tz = paramParcel.readInt();
      this.tA = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("MediaItem{");
      localStringBuilder.append("mFlags=").append(this.tz);
      localStringBuilder.append(", mDescription=").append(this.tA);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(this.tz);
      this.tA.writeToParcel(paramParcel, paramInt);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/android/support/v4/media/MediaBrowserCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */