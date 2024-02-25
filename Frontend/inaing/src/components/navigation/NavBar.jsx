import React, { useState } from 'react'
import styled from 'styled-components'
import logo from '../../assets/images/logo/logo.png'
import accountIcon from '../../assets/images/icon/account-icon.png'
import wishlistIcon from '../../assets/images/icon/wishlist-icon.png'
import cartIcon from '../../assets/images/icon/cart-icon.png'
import locationIcon from '../../assets/images/icon/location-icon.png'
import searchIcon from '../../assets/images/icon/search-icon.png'
import { useNavigate } from 'react-router-dom'
import TopBar from '../TopBar/TopBar'
import CartDrawer from '../drawer/CartDrawer'
import SearchDrawer from '../drawer/SearchDrawer'
import NavBarDrawer from './NavBarDrawer'

const Wrapper = styled.div`
  position : fixed;
  top : 0;
  width : 100%;
  background-color : white;
  z-index : 999;
  border-bottom : 1px solid #15325b2d;
`
const Container = styled.div`
  display : flex;
  align-items : center;
  justify-content : space-between;
  height : 100px;
  margin : auto 40px;
`
const Logo = styled.div`
  img{
    height : 70px;
    cursor: pointer;
  }
  @media (max-width: 900px) {
    order : 2;
  }
`
const MenuItems = styled.div`
  color : #0f2c56;
  font-size : 16px;
  ul {
    list-style: none;
    margin: 0;
    display: flex;
    align-items : center;
  }
  li {
    display: inline-block;
    display: inline;
    margin: 12px;
    position: relative;
    cursor: pointer;
  }
  a {
    padding-bottom: 10px;
    text-decoration: none;
    color : inherit;
    transition: all .5s;
  }
  a:after {
    position: absolute;
    bottom: 0;
    left: 0;
    right: 0;
    margin: auto;
    width: 0%;
    content: '.';
    color: transparent;
    background: #0f2c56;
    height: 1px;
    transition: all .3s;
  }
  a:hover:after {
    width: 100%;
  }
  .active:after {
    position: absolute;
    bottom: 0;
    left: 0;
    right: 0;
    margin: auto;
    width: 0%;
    content: '.';
    color: transparent;
    height: 1px;
    transition: all .3s;
  }
  .active:after {
    width: 100%;
  }

  @media (max-width: 900px) {
    display : none;
  }
  `
const Icons = styled.div`
  display : flex;
  @media (max-width: 900px) {
    display : none;
  }
`
const IconsCollapsed = styled.div`
  display : flex;
  order : 3;
  @media (min-width: 900px) {
    display : none;
  }
`

const NavIconCollapsed = styled.div`
  display : none;
  @media (max-width: 900px) {
  display : initial;
  }
  svg{
      height : 25px;
      width : 30px;
      margin-right : 10px;
      cursor: pointer;
      color : #0f2c56;
    }
`
const Icon = styled.div`
  margin : 10px;
  cursor: pointer;
`
const Divider = styled.div`
  height : 25px;
  width : 1px;
  margin-top : 15px;
  background-color : #80808096;
`
function NavBar({currentPage}) {
  const [drawer,setDrawer] = useState(false);
  const [searchDrawer,setSearchDrawer] = useState(false);
  const [collapsedNav,setcollapsedNav] = useState(false);
  const navigate = useNavigate();
  return (
    <Wrapper>
      <TopBar/>
      <Container>
        <Logo onClick={() => navigate("/")}>
          <img src={logo} alt=""/>
        </Logo>
        <MenuItems>
          <ul>
            <li><a href='/women'>Women</a></li>
            <li><a href='/men'>Men</a></li>
            <li><a href='/kids'>Kids</a></li>
            <li><a href='/cosmetics'>Cosmetics</a></li>
            <li><a href='/accessories'>Accessories</a></li>
            <li>
              <Icon onClick={()=>{setSearchDrawer(!searchDrawer); setcollapsedNav(false); setDrawer(false)}}>
                <img src={searchIcon} alt="" height="30px"/>
              </Icon>
            </li>
          </ul>
        </MenuItems>
        <Icons>
          <Icon>
            <img src={locationIcon} alt="" height="35px"/>
          </Icon>
          <Icon>
            <img src={wishlistIcon} alt="" height="30px"/>
          </Icon>
          <Icon onClick={()=>navigate('/login')}>
            <img src={accountIcon} alt="" height="35px"/>
          </Icon>
          <Divider/>
          <Icon onClick={(e) => { e.preventDefault(); setDrawer(!drawer);setcollapsedNav(false); setSearchDrawer(false)}}>
            <img src={cartIcon} alt="" height="32px" />
          </Icon>
        </Icons>
        <IconsCollapsed>
          <Icon onClick={()=>{setSearchDrawer(!searchDrawer); setcollapsedNav(false); setDrawer(false)}}>
            <img src={searchIcon} alt="" height="35px"/>
          </Icon>
          <Divider/>
          <Icon onClick={()=>{setDrawer(!drawer); setcollapsedNav(false); setSearchDrawer(false)}}>
            <img src={cartIcon} alt="" height="32px"/>
          </Icon>
        </IconsCollapsed>
        <NavIconCollapsed>
              <Icon onClick={()=>{setcollapsedNav(!collapsedNav);setSearchDrawer(false); setDrawer(false)}}>
                <svg version="1.0" xmlns="http://www.w3.org/2000/svg"
                  width="256.000000pt" height="256.000000pt" viewBox="0 0 256.000000 256.000000"
                  preserveAspectRatio="xMidYMid meet">
                  <g transform="translate(0.000000,256.000000) scale(0.100000,-0.100000)"
                  fill="#000000" stroke="none">
                    <path d="M149 2152 c-15 -13 -22 -30 -22 -52 0 -22 7 -39 22 -52 22 -17 69
                    -18 1131 -18 1062 0 1109 1 1131 18 31 26 31 78 0 104 -22 17 -69 18 -1131 18
                    -1062 0 -1109 -1 -1131 -18z"/>
                    <path d="M149 1332 c-15 -13 -22 -30 -22 -52 0 -22 7 -39 22 -52 22 -17 69
                    -18 1131 -18 1062 0 1109 1 1131 18 31 26 31 78 0 104 -22 17 -69 18 -1131 18
                    -1062 0 -1109 -1 -1131 -18z"/>
                    <path d="M149 512 c-15 -13 -22 -30 -22 -52 0 -22 7 -39 22 -52 22 -17 69 -18
                    1131 -18 1062 0 1109 1 1131 18 31 26 31 78 0 104 -22 17 -69 18 -1131 18
                    -1062 0 -1109 -1 -1131 -18z"/>
                  </g>
                </svg>
              </Icon>
        </NavIconCollapsed>
      </Container>
      {drawer ? <CartDrawer/> : ''}
      {searchDrawer ? <SearchDrawer/> : ''}
      {collapsedNav ? <NavBarDrawer currentPage={currentPage}/> : ''}
    </Wrapper>
  )
}

export default NavBar