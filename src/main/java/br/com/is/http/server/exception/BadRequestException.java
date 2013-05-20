/* Copyright (C) 2013 Leonardo Bispo de Oliveira
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2 of
 * the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package br.com.is.http.server.exception;

import br.com.is.http.server.HTTPStatus;

public class BadRequestException extends HTTPRequestException {

  private static final long serialVersionUID = 6614991236571962812L;

  public BadRequestException(String message) {
    super(HTTPStatus.BAD_REQUEST, message);
  }

  public BadRequestException(String message, Throwable cause) {
    super(HTTPStatus.BAD_REQUEST, message, cause);
  }
}
