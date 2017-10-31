package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Credential
  implements SafeParcelable
{
  public static final Parcelable.Creator<Credential> CREATOR = new a();
  public final String abS;
  public final String afI;
  public final String afJ;
  public final Uri afK;
  public final List<IdToken> afL;
  public final String afM;
  public final String afN;
  public final String afO;
  public final String afP;
  public final String mName;
  final int mVersionCode;
  
  Credential(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, List<IdToken> paramList, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    this.mVersionCode = paramInt;
    this.afI = paramString1;
    this.afJ = paramString2;
    this.abS = ((String)w.aa(paramString3));
    this.mName = paramString4;
    this.afK = paramUri;
    if (paramList == null) {}
    for (paramString1 = Collections.emptyList();; paramString1 = Collections.unmodifiableList(paramList))
    {
      this.afL = paramString1;
      this.afM = paramString5;
      this.afN = paramString6;
      this.afO = paramString7;
      this.afP = paramString8;
      return;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof Credential)) {
        return false;
      }
      paramObject = (Credential)paramObject;
    } while ((TextUtils.equals(this.abS, ((Credential)paramObject).abS)) && (TextUtils.equals(this.mName, ((Credential)paramObject).mName)) && (v.d(this.afK, ((Credential)paramObject).afK)) && (TextUtils.equals(this.afM, ((Credential)paramObject).afM)) && (TextUtils.equals(this.afN, ((Credential)paramObject).afN)) && (TextUtils.equals(this.afO, ((Credential)paramObject).afO)));
    return false;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { this.abS, this.mName, this.afK, this.afM, this.afN, this.afO });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/auth/api/credentials/Credential.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */