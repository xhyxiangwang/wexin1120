package com.tencent.wecall.talkroom.model;

import com.tencent.mm.plugin.multi.talk;
import com.tencent.pb.common.a.a;
import com.tencent.pb.common.c.c;
import java.util.concurrent.atomic.AtomicInteger;

public final class b
{
  talk xLI = new talk();
  
  public b()
  {
    c.d("simon:TalkRoomContext", new Object[] { "construct" });
  }
  
  public final int Close()
  {
    if (!a.xmH) {
      return 0;
    }
    try
    {
      i = this.xLI.close();
      c.d("simon:TalkRoomContext", new Object[] { "Close ret: ", Integer.valueOf(i) });
      return i;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        c.k("simon:TalkRoomContext", new Object[] { "Close ", localThrowable });
        int i = 0;
      }
    }
  }
  
  public final void OnMembersChanged(int[] paramArrayOfInt)
  {
    if (!a.xmH) {
      return;
    }
    this.xLI.OnMembersChanged(paramArrayOfInt);
  }
  
  public final byte[] cnX()
  {
    if (!a.xmH) {
      return new byte[0];
    }
    return this.xLI.field_capInfo;
  }
  
  public final int cnY()
  {
    try
    {
      if (!a.xmH) {
        return 0;
      }
      AtomicInteger localAtomicInteger1 = new AtomicInteger();
      AtomicInteger localAtomicInteger2 = new AtomicInteger();
      this.xLI.getChannelBytes(localAtomicInteger1, localAtomicInteger2);
      int i = localAtomicInteger2.get();
      return i;
    }
    catch (Throwable localThrowable)
    {
      c.k("simon:TalkRoomContext", new Object[] { "getTotalWWANBytes: ", localThrowable });
    }
    return 0;
  }
  
  public final int uninitLive()
  {
    if (!a.xmH) {
      return 0;
    }
    try
    {
      i = this.xLI.uninit();
      c.d("simon:TalkRoomContext", new Object[] { "uninitLive ret: ", Integer.valueOf(i) });
      return i;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        c.k("simon:TalkRoomContext", new Object[] { "uninitLive ", localThrowable });
        int i = 0;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */