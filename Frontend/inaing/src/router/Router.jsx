import React from 'react'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import HomePage from '../pages/HomePage'
import AllProductsPage from '../pages/AllProductsPage'
import ItemPage from '../pages/ItemPage'
import LoginPage from '../pages/LoginPage'
import RegisterPage from '../pages/RegisterPage'

function Router() {
  return (
    <BrowserRouter>
        <Routes>
            <Route path='/' element = {<HomePage/>}/>
            <Route path='/home' element = {<HomePage/>}/>
            <Route path='/login' element = {<LoginPage/>}/>
            <Route path='/register' element = {<RegisterPage/>}/>
            <Route path='/women' element = {<AllProductsPage type={"Women"}/>}/>
            <Route path='/men' element = {<AllProductsPage type={"Men"}/>}/>
            <Route path='/kids' element = {<AllProductsPage type={"Kids"}/>}/>
            <Route path='/accessories' element = {<AllProductsPage type={"Accessories"}/>}/>
            <Route path='/cosmetics' element = {<AllProductsPage type={"Cosmetics"}/>}/>
            <Route path='/item' element = {<ItemPage/>}/>
        </Routes>
    </BrowserRouter>
  )
}

export default Router