package org.softuni.productshop.web.controllers;

import org.softuni.productshop.error.ProductNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

//@ControllerAdvice
public class GlobalExceptionHandler extends BaseController {

