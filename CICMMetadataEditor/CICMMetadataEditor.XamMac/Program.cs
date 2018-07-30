// /***************************************************************************
// Canary Islands Computer Museum Metadata Editor
// ----------------------------------------------------------------------------
//
// Filename       : MainForm.xeto.cs
// Author(s)      : Natalia Portillo <claunia@claunia.com>
//
// Component      : Eto.XamMac
//
// --[ Description ] ----------------------------------------------------------
//
//     Contains startup code for Eto framework under Xamarin.Mac
//
// --[ License ] --------------------------------------------------------------
//
//     This library is free software; you can redistribute it and/or modify
//     it under the terms of the GNU Lesser General Public License as
//     published by the Free Software Foundation; either version 2.1 of the
//     License, or (at your option) any later version.
//
//     This library is distributed in the hope that it will be useful, but
//     WITHOUT ANY WARRANTY; without even the implied warranty of
//     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
//     Lesser General Public License for more details.
//
//     You should have received a copy of the GNU Lesser General Public
//     License along with this library; if not, see <http://www.gnu.org/licenses/>.
//
// ----------------------------------------------------------------------------
// Copyright © 2018 Natalia Portillo
// ****************************************************************************/
using AppKit;
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
