package com.tencent.wecall.talkroom.model;

import android.text.TextUtils;
import com.tencent.pb.common.c.c;

public final class j
{
  public static boolean Yi(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    return paramString.startsWith("client_");
  }
  
  public static int cow()
  {
    try
    {
      int i = a.cnN().ndF;
      return i;
    }
    catch (Exception localException)
    {
      c.k("tagorewang:VoiceGroupUtil", new Object[] { "getActiveRoomId err: ", localException });
    }
    return 0;
  }
  
  public static long cox()
  {
    try
    {
      long l = a.cnN().xMh;
      return l;
    }
    catch (Exception localException)
    {
      c.k("tagorewang:VoiceGroupUtil", new Object[] { "getActiveRoomKey err: ", localException });
    }
    return 0L;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */