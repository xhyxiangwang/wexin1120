package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.ac.f;
import com.tencent.mm.bl.a;
import com.tencent.mm.plugin.backup.h.x;
import com.tencent.mm.plugin.backup.h.y;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.protocal.c.eh;
import com.tencent.mm.protocal.c.ei;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.x.ap;
import java.io.IOException;
import java.util.LinkedList;

public final class h
  extends com.tencent.mm.plugin.backup.f.b
{
  private static int progress;
  private String filePath;
  private int hld;
  x jRj;
  private y jRk;
  private f jUj;
  private byte[] jUk;
  private int offset;
  private int start;
  private int type;
  
  public h(String paramString1, int paramInt, LinkedList<eh> paramLinkedList, String paramString2, f paramf)
  {
    GMTrace.i(14754017968128L, 109926);
    this.jRj = new x();
    this.jRk = new y();
    this.jUj = null;
    this.start = 0;
    this.offset = 0;
    this.hld = 0;
    this.jRj.jXS = paramString1;
    this.jRj.jXT = paramInt;
    this.type = paramInt;
    if (paramInt == 1)
    {
      paramString1 = new ei();
      paramString1.jWR = paramLinkedList;
      paramString1.jWQ = paramLinkedList.size();
    }
    for (;;)
    {
      try
      {
        this.jUk = paramString1.toByteArray();
        this.hld = this.jUk.length;
        paramInt = this.hld;
        this.jRj.jXU = (16 - paramInt % 16 + this.hld);
        w.i("MicroMsg.BakSceneDataPush", "BakSceneDataPush init:%s  type:%d, localTotalLen:%d, reqDataSize:%d", new Object[] { this.jRj.jXS, Integer.valueOf(this.jRj.jXT), Integer.valueOf(this.hld), Integer.valueOf(this.jRj.jXU) });
        this.jUj = paramf;
        GMTrace.o(14754017968128L, 109926);
        return;
      }
      catch (IOException paramString1)
      {
        w.e("MicroMsg.BakSceneDataPush", "backList to buffer error");
        w.printErrStackTrace("MicroMsg.BakSceneDataPush", paramString1, "", new Object[0]);
        continue;
      }
      this.filePath = paramString2;
      this.hld = e.aY(paramString2);
    }
  }
  
  public static void setProgress(int paramInt)
  {
    GMTrace.i(14754152185856L, 109927);
    w.i("MicroMsg.BakSceneDataPush", "setProgress %d", new Object[] { Integer.valueOf(paramInt) });
    progress = paramInt;
    GMTrace.o(14754152185856L, 109927);
  }
  
  public final a aeP()
  {
    GMTrace.i(14754420621312L, 109929);
    y localy = this.jRk;
    GMTrace.o(14754420621312L, 109929);
    return localy;
  }
  
  public final a aeQ()
  {
    GMTrace.i(14754554839040L, 109930);
    x localx = this.jRj;
    GMTrace.o(14754554839040L, 109930);
    return localx;
  }
  
  public final void aeR()
  {
    GMTrace.i(14754689056768L, 109931);
    w.i("MicroMsg.BakSceneDataPush", "onSceneEnd id:%s, type:%d, s:%d, e:%d, status:%d", new Object[] { this.jRk.jXS, Integer.valueOf(this.jRk.jXT), Integer.valueOf(this.jRk.jXV), Integer.valueOf(this.jRk.jXW), Integer.valueOf(this.jRk.jXo) });
    if (this.jRk.jXo != 0)
    {
      w.e("MicroMsg.BakSceneDataPush", "status:%d", new Object[] { Integer.valueOf(this.jRk.jXo) });
      g(4, this.jRk.jXo, "error");
      GMTrace.o(14754689056768L, 109931);
      return;
    }
    this.jUj.a(this.jRj.jXW - this.jRj.jXV, this.hld, this);
    if (this.offset == this.hld)
    {
      w.i("MicroMsg.BakSceneDataPush", "back complete: %s,  %d", new Object[] { this.jRj.jXS, Integer.valueOf(this.hld) });
      g(0, 0, "success");
      GMTrace.o(14754689056768L, 109931);
      return;
    }
    aeV();
    GMTrace.o(14754689056768L, 109931);
  }
  
  public final boolean aeV()
  {
    GMTrace.i(14754286403584L, 109928);
    int i;
    Object localObject1;
    if (this.type == 1)
    {
      i = this.hld;
      localObject1 = this.jUk;
    }
    for (;;)
    {
      this.start = this.offset;
      this.offset = (i + this.start);
      this.jRj.jXV = this.start;
      Object localObject2 = this.jRj;
      int j = this.start;
      if (localObject1 == null) {}
      int k;
      for (i = 0;; i = localObject1.length)
      {
        ((x)localObject2).jXW = (i + j);
        this.jRj.jWD = new com.tencent.mm.bl.b((byte[])localObject1);
        this.jRj.jXY = progress;
        w.i("MicroMsg.BakSceneDataPush", "doSecne %s---total:%d, start:%d, offset:%d, data.len:%d", new Object[] { this.jRj.jXS, Integer.valueOf(this.hld), Integer.valueOf(this.start), Integer.valueOf(this.offset), Integer.valueOf(localObject1.length) });
        boolean bool = super.aeV();
        GMTrace.o(14754286403584L, 109928);
        return bool;
        long l;
        if (this.hld - this.offset > 524288L)
        {
          l = 524288L;
          k = (int)l;
          localObject1 = null;
          i = 3;
        }
        for (;;)
        {
          j = i - 1;
          if ((i <= 0) || (localObject1 != null)) {
            break label436;
          }
          if (!bg.mZ(this.filePath))
          {
            localObject1 = this.filePath;
            ap.AS();
            if (((String)localObject1).startsWith(com.tencent.mm.x.c.zc()))
            {
              localObject1 = this.filePath.substring(this.filePath.lastIndexOf("/") + 1);
              w.i("MicroMsg.BakSceneDataPush", "md5:%s", new Object[] { localObject1 });
              localObject1 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vr((String)localObject1);
              if ((localObject1 != null) && ((((EmojiInfo)localObject1).field_reserved4 & EmojiInfo.vgD) == EmojiInfo.vgD))
              {
                localObject2 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a((EmojiInfo)localObject1);
                localObject1 = new byte[k];
                System.arraycopy(localObject2, this.offset, localObject1, 0, k);
                i = j;
                continue;
                l = this.hld - this.offset;
                break;
              }
              localObject1 = e.c(this.filePath, this.offset, k);
              i = j;
              continue;
            }
          }
          localObject1 = e.c(this.filePath, this.offset, k);
          i = j;
        }
        label436:
        if (localObject1 != null) {
          break label487;
        }
        w.e("MicroMsg.BakSceneDataPush", "read file error, offset%d, len:%d", new Object[] { Integer.valueOf(this.offset), Integer.valueOf(k) });
        localObject1 = new byte[0];
        i = k;
        break;
      }
      label487:
      i = k;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(14754823274496L, 109932);
    GMTrace.o(14754823274496L, 109932);
    return 6;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldmovemodel/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */