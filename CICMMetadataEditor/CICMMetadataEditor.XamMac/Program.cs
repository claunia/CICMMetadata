﻿using AppKit;
using Eto.Forms;

namespace CICMMetadataEditor.XamMac
{
    static class MainClass
    {
        static void Main(string[] args)
        {
            new Application(Eto.Platforms.XamMac2).Run(new MainForm());
        }
    }
}
