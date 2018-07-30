// /***************************************************************************
// Canary Islands Computer Museum Metadata Editor
// ----------------------------------------------------------------------------
//
// Filename       : MainForm.xeto.cs
// Author(s)      : Natalia Portillo <claunia@claunia.com>
//
// Component      : Main form.
//
// --[ Description ] ----------------------------------------------------------
//
//     Contains startup form.
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
using System;
using System.Collections.Generic;
using Eto.Forms;
using Eto.Drawing;
using Eto.Serialization.Xaml;

namespace CICMMetadataEditor
{
    public class MainForm : Form
    {
        public MainForm()
        {
            XamlReader.Load(this);
        }

        protected void HandleClickMe(object sender, EventArgs e)
        {
            MessageBox.Show("I was clicked!");
        }

        protected void HandleAbout(object sender, EventArgs e)
        {
            new AboutDialog().ShowDialog(this);
        }

        protected void HandleQuit(object sender, EventArgs e)
        {
            Application.Instance.Quit();
        }
    }
}
