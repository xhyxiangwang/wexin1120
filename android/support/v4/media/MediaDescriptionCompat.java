package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class MediaDescriptionCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator() {};
  private final Bundle mExtras;
  private final String ub;
  private final CharSequence uc;
  private final CharSequence ud;
  private final CharSequence ue;
  private final Bitmap uf;
  private final Uri ug;
  private final Uri uh;
  private Object ui;
  
  public MediaDescriptionCompat(Parcel paramParcel)
  {
    this.ub = paramParcel.readString();
    this.uc = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.ud = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.ue = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.uf = ((Bitmap)paramParcel.readParcelable(null));
    this.ug = ((Uri)paramParcel.readParcelable(null));
    this.mExtras = paramParcel.readBundle();
    this.uh = ((Uri)paramParcel.readParcelable(null));
  }
  
  private MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2)
  {
    this.ub = paramString;
    this.uc = paramCharSequence1;
    this.ud = paramCharSequence2;
    this.ue = paramCharSequence3;
    this.uf = paramBitmap;
    this.ug = paramUri1;
    this.mExtras = paramBundle;
    this.uh = paramUri2;
  }
  
  public static MediaDescriptionCompat f(Object paramObject)
  {
    if ((paramObject == null) || (Build.VERSION.SDK_INT < 21)) {
      return null;
    }
    a locala = new a();
    locala.ub = ((MediaDescription)paramObject).getMediaId();
    locala.uc = ((MediaDescription)paramObject).getTitle();
    locala.ud = ((MediaDescription)paramObject).getSubtitle();
    locala.ue = ((MediaDescription)paramObject).getDescription();
    locala.uf = ((MediaDescription)paramObject).getIconBitmap();
    locala.ug = ((MediaDescription)paramObject).getIconUri();
    Bundle localBundle = ((MediaDescription)paramObject).getExtras();
    Object localObject;
    if (localBundle == null)
    {
      localObject = null;
      if (localObject == null) {
        break label211;
      }
      if ((!localBundle.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG")) || (localBundle.size() != 2)) {
        break label199;
      }
      localBundle = null;
      label125:
      locala.mExtras = localBundle;
      if (localObject == null) {
        break label214;
      }
      locala.uh = ((Uri)localObject);
    }
    for (;;)
    {
      localObject = new MediaDescriptionCompat(locala.ub, locala.uc, locala.ud, locala.ue, locala.uf, locala.ug, locala.mExtras, locala.uh);
      ((MediaDescriptionCompat)localObject).ui = paramObject;
      return (MediaDescriptionCompat)localObject;
      localObject = (Uri)localBundle.getParcelable("android.support.v4.media.description.MEDIA_URI");
      break;
      label199:
      localBundle.remove("android.support.v4.media.description.MEDIA_URI");
      localBundle.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
      label211:
      break label125;
      label214:
      if (Build.VERSION.SDK_INT >= 23) {
        locala.uh = ((MediaDescription)paramObject).getMediaUri();
      }
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return this.uc + ", " + this.ud + ", " + this.ue;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (Build.VERSION.SDK_INT < 21)
    {
      paramParcel.writeString(this.ub);
      TextUtils.writeToParcel(this.uc, paramParcel, paramInt);
      TextUtils.writeToParcel(this.ud, paramParcel, paramInt);
      TextUtils.writeToParcel(this.ue, paramParcel, paramInt);
      paramParcel.writeParcelable(this.uf, paramInt);
      paramParcel.writeParcelable(this.ug, paramInt);
      paramParcel.writeBundle(this.mExtras);
      paramParcel.writeParcelable(this.uh, paramInt);
      return;
    }
    if ((this.ui != null) || (Build.VERSION.SDK_INT < 21))
    {
      localObject = this.ui;
      ((MediaDescription)localObject).writeToParcel(paramParcel, paramInt);
      return;
    }
    MediaDescription.Builder localBuilder = new MediaDescription.Builder();
    Object localObject = this.ub;
    ((MediaDescription.Builder)localBuilder).setMediaId((String)localObject);
    localObject = this.uc;
    ((MediaDescription.Builder)localBuilder).setTitle((CharSequence)localObject);
    localObject = this.ud;
    ((MediaDescription.Builder)localBuilder).setSubtitle((CharSequence)localObject);
    localObject = this.ue;
    ((MediaDescription.Builder)localBuilder).setDescription((CharSequence)localObject);
    localObject = this.uf;
    ((MediaDescription.Builder)localBuilder).setIconBitmap((Bitmap)localObject);
    localObject = this.ug;
    ((MediaDescription.Builder)localBuilder).setIconUri((Uri)localObject);
    Bundle localBundle = this.mExtras;
    if ((Build.VERSION.SDK_INT < 23) && (this.uh != null))
    {
      localObject = localBundle;
      if (localBundle == null)
      {
        localObject = new Bundle();
        ((Bundle)localObject).putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
      }
      ((Bundle)localObject).putParcelable("android.support.v4.media.description.MEDIA_URI", this.uh);
    }
    for (;;)
    {
      ((MediaDescription.Builder)localBuilder).setExtras((Bundle)localObject);
      if (Build.VERSION.SDK_INT >= 23)
      {
        localObject = this.uh;
        ((MediaDescription.Builder)localBuilder).setMediaUri((Uri)localObject);
      }
      this.ui = ((MediaDescription.Builder)localBuilder).build();
      localObject = this.ui;
      break;
      localObject = localBundle;
    }
  }
  
  public static final class a
  {
    Bundle mExtras;
    String ub;
    CharSequence uc;
    CharSequence ud;
    CharSequence ue;
    Bitmap uf;
    Uri ug;
    Uri uh;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/android/support/v4/media/MediaDescriptionCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */