//Rextester.Program.Main is the entry point for your code. Don't change it.
//Compiler version 4.0.30319.17929 for Microsoft (R) .NET Framework 4.5

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace Rextester
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Enter a String value:-");
		string s=Console.ReadLine();
		char[] carr=s.ToCharArray();
		
		Console.WriteLine("Enter a Starting point value:-");
		int start=Convert.ToInt32(Console.ReadLine());
		Console.WriteLine("Enter a End point value:-");
		int end=Convert.ToInt32(Console.ReadLine());
		if(start>=0 && end<carr.Length){
			for(int i=start;i<=end;i=i+1){
				char ch=carr[i];
				int p=i;
				for(int j=i+1;j<=end;j=j+1){
					if(ch<carr[j]){
						ch=carr[j];
						p=j;
					}
				}
				char temp=carr[i];
				carr[i]=ch;
				carr[p]=temp;
			}
			string t=new string(carr);
			Console.WriteLine("output",t);
		}
        }
    }
}
