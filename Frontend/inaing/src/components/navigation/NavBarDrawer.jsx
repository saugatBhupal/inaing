import React from 'react'
import styled from 'styled-components'
import ButtonA from '../button/ButtonA'
import InputA from '../input/InputA'
import ItemCard from '../card/ItemCard'
import SearchItemCard from '../card/SearchItemCard'
import accountIcon from '../../assets/images/icon/account-icon.png'
import wishlistIcon from '../../assets/images/icon/wishlist-icon.png'
import { useNavigate } from 'react-router-dom'

const Wrapper = styled.div`
    position : fixed;
    height : 100%;
    width : 100%;
    background-color : #0000005b;
    border-top : 1px solid #15325513;
`
const Container = styled.div`
    position : fixed;
    height : 100%;
    width : 350px;
    background-color : #ffffff;
    left : 0;
    animation : appear 0.6s;
    @keyframes appear {
        from{
            opacity : 0;
            transform : translateX(-350px)
        }
        to{
            opacity : 1;
            transform : translateX(0px)
        }
    }
`
const MenuItems = styled.div`
    display : flex;
    flex-direction : column;
    a{
        text-decoration : none;
        color : inherit;
    }
`
const Item = styled.div`
    font-size : 20px;
    padding : 15px 0;
    margin-bottom : 2px;
    color : #ffffff;
    background-color : #0f2c56;
    a{
        padding : 24px
    }
    cursor: pointer;
`
const ItemCurrent = styled.div`
    font-size : 14px;
    padding : 18px 0;
    margin-bottom : 2px;
    color : #0f2c56;
    a{
        padding : 24px
    }
    cursor: pointer;
`
const Bottom = styled.div`
    display : flex;
    justify-content : space-between;
`
const Icon = styled.div`
  margin : 10px;
  cursor: pointer;
  display : flex;
  align-items : center;
  a{
    font-size : 12px;
    margin : 12px;
  }
`
function NavBarDrawer({currentPage}) {
    const menuItems = ['Home','Women','Men','Kids','Cosmetics','Accessories'];
    const navigate = useNavigate();
    return (
        <Wrapper> 
            <Container>
                <MenuItems>
                    {menuItems.map((item, index) => (
                    item === currentPage ? (
                        <ItemCurrent onClick={() => navigate("/" + item)} key={index}><a>{item}</a></ItemCurrent>
                    ) : (
                        <Item onClick={() => navigate("/" + item)} key={index}><a>{item}</a></Item>
                    )
                    ))}
                </MenuItems>
                <Bottom>
                        <Icon>
                            <img src={accountIcon} alt="" height="25px"/> <a>Account</a>
                        </Icon>
                        <Icon>
                            <img src={wishlistIcon} alt="" height="25px"/> <a>Wishlist</a>
                        </Icon>
                </Bottom>
            </Container>
        </Wrapper>
    )
}

export default NavBarDrawer