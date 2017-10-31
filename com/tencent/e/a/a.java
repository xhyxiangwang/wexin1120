package com.tencent.e.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public HashMap<String, Object> xLv = new HashMap();
  public Object xLw = new Object();
  c xLx;
  
  public final void a(d paramd, String[] paramArrayOfString)
  {
    if ((paramd == null) || (paramArrayOfString == null)) {
      return;
    }
    for (;;)
    {
      int i;
      Object localObject2;
      Object localObject3;
      synchronized (this.xLw)
      {
        int j = paramArrayOfString.length;
        i = 0;
        if (i >= j) {
          break label178;
        }
        localObject2 = paramArrayOfString[i];
        if (localObject2 == null) {
          break label182;
        }
        localObject3 = this.xLv.get(localObject2);
        if (localObject3 == null)
        {
          this.xLv.put(localObject2, paramd);
          break label182;
        }
        if (!(localObject3 instanceof d)) {
          break label140;
        }
        localObject3 = (d)localObject3;
        if (localObject3 == paramd) {
          return;
        }
      }
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(localObject3);
      localLinkedList.add(paramd);
      this.xLv.put(localObject2, localLinkedList);
      break label182;
      label140:
      if ((localObject3 instanceof List))
      {
        localObject2 = (LinkedList)localObject3;
        if (((LinkedList)localObject2).indexOf(paramd) >= 0) {
          return;
        }
        ((LinkedList)localObject2).add(paramd);
        break label182;
        label178:
        return;
      }
      label182:
      i += 1;
    }
  }
  
  public final void b(String arg1, int paramInt, Object paramObject)
  {
    Object localObject2 = null;
    Object localObject3 = this.xLx;
    Object localObject1 = ((com.tencent.e.d)localObject3).cnJ();
    if (localObject1 == null)
    {
      localObject1 = ((com.tencent.e.d)localObject3).cnI();
      localObject1 = (e)localObject1;
      ((e)localObject1).fGv = ???;
      ((e)localObject1).xLz = paramInt;
      ((e)localObject1).arg1 = 0;
      ((e)localObject1).arg2 = 0;
      ((e)localObject1).obj = paramObject;
      if ((localObject1 != null) && (((e)localObject1).fGv != null))
      {
        System.currentTimeMillis();
        localObject3 = ((e)localObject1).fGv;
      }
    }
    else
    {
      for (;;)
      {
        synchronized (this.xLw)
        {
          ??? = this.xLv.get(localObject3);
          if (??? == null) {
            break label283;
          }
          if ((??? instanceof d))
          {
            ??? = (d)???;
            paramObject = localObject2;
            if (??? != null) {
              ???.dr((String)localObject3, ((e)localObject1).xLz);
            }
            if (paramObject == null) {
              break label228;
            }
            ??? = ((LinkedList)paramObject).iterator();
            if (!???.hasNext()) {
              break label228;
            }
            ((d)???.next()).dr((String)localObject3, ((e)localObject1).xLz);
            continue;
            ((com.tencent.e.e)localObject1).reset();
            break;
          }
          if (!(??? instanceof List)) {
            break label283;
          }
          paramObject = (LinkedList)((LinkedList)???).clone();
          ??? = null;
        }
        label228:
        paramObject = this.xLx;
        synchronized (((com.tencent.e.d)paramObject).mLock)
        {
          paramInt = ((com.tencent.e.d)paramObject).xLh.length;
          if (((com.tencent.e.d)paramObject).pCe < paramInt)
          {
            ((com.tencent.e.d)paramObject).xLh[paramObject.pCe] = localObject1;
            ((com.tencent.e.d)paramObject).pCe += 1;
          }
          return;
        }
        label283:
        ??? = null;
        paramObject = localObject2;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/e/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */