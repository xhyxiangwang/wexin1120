package com.tencent.mm.plugin.backup.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.backup.h.u;
import com.tencent.mm.plugin.emoji.b.c;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.protocal.c.axu;
import com.tencent.mm.protocal.c.eh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.LinkedList;

public final class b
{
  public static int a(a parama)
  {
    GMTrace.i(14818979348480L, 110410);
    int i = e.aY(parama.filePath);
    if ((i <= 0) || (parama.jPw == null))
    {
      localObject = new StringBuilder("filePath error or bakitem is null ").append(parama.filePath);
      if (parama.jPw == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.e("MicroMsg.BackupPackUtil", bool);
        GMTrace.o(14818979348480L, 110410);
        return 0;
      }
    }
    if (parama.jPy)
    {
      GMTrace.o(14818979348480L, 110410);
      return i;
    }
    if ((i < 8192) && (parama.jPw.tyt.usf == 0))
    {
      if (parama.fzJ == 5) {
        if (parama.jPB == null)
        {
          w.e("MicroMsg.BackupPackUtil", "MMBAK_EMOJI type but emojiInfo is null!");
          localObject = null;
        }
      }
      for (;;)
      {
        localObject = new axs().bd((byte[])localObject);
        parama.jPw.tyu = i;
        parama.jPw.tyv = parama.fzJ;
        parama.jPw.tyt = ((axs)localObject);
        GMTrace.o(14818979348480L, 110410);
        return i;
        localObject = ((c)h.j(c.class)).getEmojiMgr().a(parama.jPB);
        continue;
        localObject = e.d(parama.filePath, 0, -1);
      }
    }
    if (parama.jPx == null)
    {
      w.e("MicroMsg.BackupPackUtil", "error addupMediaList == null");
      GMTrace.o(14818979348480L, 110410);
      return 0;
    }
    Object localObject = parama.jPw.tvo.toString() + "_" + parama.jPw.tvp.toString() + "_" + parama.jPw.tvv + "_backup" + parama.jPz;
    w.d("MicroMsg.BackupPackUtil", "filePath " + parama.filePath + " " + (String)localObject);
    parama.jPw.tyr.add(new axt().Qx((String)localObject));
    parama.jPw.tys.add(new axu().zw(parama.fzJ));
    if (parama.jPt == null) {
      parama.jPt = new u();
    }
    parama.jPt.jXM = parama.jPw.tvv;
    parama.jPt.mediaId = ((String)localObject);
    parama.jPt.path = parama.filePath;
    parama.jPt.type = parama.fzJ;
    if (!parama.jPA) {
      parama.jPx.add(parama.jPt);
    }
    parama.jPw.tyq = parama.jPw.tyr.size();
    GMTrace.o(14818979348480L, 110410);
    return 0;
  }
  
  public static final class a
  {
    String filePath;
    int fzJ;
    boolean jPA;
    EmojiInfo jPB;
    u jPt;
    eh jPw;
    LinkedList<u> jPx;
    boolean jPy;
    String jPz;
    
    public a(String paramString1, eh parameh, LinkedList<u> paramLinkedList, int paramInt, boolean paramBoolean1, String paramString2, boolean paramBoolean2)
    {
      GMTrace.i(14818710913024L, 110408);
      this.jPy = true;
      this.filePath = paramString1;
      this.jPw = parameh;
      this.jPx = paramLinkedList;
      this.fzJ = paramInt;
      this.jPy = paramBoolean1;
      this.jPz = paramString2;
      this.jPA = paramBoolean2;
      this.jPt = null;
      GMTrace.o(14818710913024L, 110408);
    }
    
    public a(String paramString, eh parameh, LinkedList<u> paramLinkedList, int paramInt, boolean paramBoolean1, boolean paramBoolean2, u paramu)
    {
      GMTrace.i(14818576695296L, 110407);
      this.jPy = true;
      this.filePath = paramString;
      this.jPw = parameh;
      this.jPx = paramLinkedList;
      this.fzJ = paramInt;
      this.jPy = paramBoolean1;
      this.jPA = paramBoolean2;
      this.jPt = paramu;
      GMTrace.o(14818576695296L, 110407);
    }
    
    public a(String paramString, eh parameh, LinkedList<u> paramLinkedList, boolean paramBoolean1, boolean paramBoolean2, EmojiInfo paramEmojiInfo)
    {
      GMTrace.i(14818845130752L, 110409);
      this.jPy = true;
      this.filePath = paramString;
      this.jPw = parameh;
      this.jPx = paramLinkedList;
      this.fzJ = 5;
      this.jPy = paramBoolean1;
      this.jPA = paramBoolean2;
      this.jPt = null;
      this.jPB = paramEmojiInfo;
      GMTrace.o(14818845130752L, 110409);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */