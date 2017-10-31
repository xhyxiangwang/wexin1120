package com.tencent.pb.common.c;

import com.tencent.pb.talkroom.sdk.e;
import com.tencent.wecall.talkroom.model.f;

public final class c
{
  public static int level = 0;
  private static int xqY = 2;
  private static boolean xqZ = false;
  
  public static void d(String paramString, Object... paramVarArgs)
  {
    if ((!xqZ) || (xqY > 1)) {}
    while (paramString == null) {
      return;
    }
    paramVarArgs = y(paramVarArgs);
    w(1, paramString, " " + paramVarArgs);
  }
  
  public static void e(String paramString, Object... paramVarArgs)
  {
    if ((!xqZ) || (xqY > 4)) {
      return;
    }
    paramVarArgs = y(paramVarArgs);
    w(4, paramString, " " + paramVarArgs);
  }
  
  public static void j(String paramString, Object... paramVarArgs)
  {
    if ((!xqZ) || (xqY > 2)) {
      return;
    }
    paramVarArgs = y(paramVarArgs);
    w(2, paramString, " " + paramVarArgs);
  }
  
  public static void k(String paramString, Object... paramVarArgs)
  {
    if ((!xqZ) || (xqY > 3)) {}
    while (paramString == null) {
      return;
    }
    paramVarArgs = y(paramVarArgs);
    w(3, paramString, " " + paramVarArgs);
  }
  
  public static void v(boolean paramBoolean, int paramInt)
  {
    xqY = 0;
    xqZ = true;
  }
  
  private static void w(int paramInt, String paramString1, String paramString2)
  {
    e locale = f.cor();
    if (locale != null) {
      locale.l(paramInt, "MTSDK" + paramString1, paramString2);
    }
  }
  
  private static String y(Object[] paramArrayOfObject)
  {
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length == 0)) {
      return "";
    }
    int j = paramArrayOfObject.length;
    StringBuffer localStringBuffer = new StringBuffer(250);
    int i = 0;
    if (i < j)
    {
      Object localObject = paramArrayOfObject[i];
      if (localObject != null)
      {
        localStringBuffer.append("|");
        if (!(localObject instanceof Throwable)) {
          break label78;
        }
        localStringBuffer.append(((Throwable)localObject).getMessage());
      }
      for (;;)
      {
        i += 1;
        break;
        label78:
        localStringBuffer.append(localObject.toString());
      }
    }
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/pb/common/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */