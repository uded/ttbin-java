/*   2014 (c) by Marcus Thiesen. This file is part of TTBinReader
 *
 *   TTBinReader is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   TTBinReader is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with TTBinReader.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.thiesen.ttbin;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TTBinReaderTest {
	
	@Test
	public void readDemoFile() throws IOException {
		
		final TTBinEntries file = TTBinEntries.read( TTBinReaderTest.class.getClassLoader().getResourceAsStream( "Running_06-27-50.ttbin") );
		Assert.assertNotNull(file);
		Assert.assertNotNull( file.getHeader() );
		
		
		
		
	}
	

}
