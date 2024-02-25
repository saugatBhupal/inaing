import React from 'react'
import styled from 'styled-components'
import ButtonA from '../button/ButtonA'
import InputA from '../input/InputA'
import ItemCard from '../card/ItemCard'
import SearchItemCard from '../card/SearchItemCard'

const Wrapper = styled.div`
    position : fixed;
    height : 100%;
    width : 100%;
    background-color : #00000019;
    border-top : 1px solid #15325513;
`
const Search = styled.div`
    position : fixed;
    height : 100%;
    width : 500px;
    background-color : #ffffff;
    right : 0;
    animation : appear 0.6s;
    @keyframes appear {
        from{
            opacity : 0;
            transform : translateX(500px)
        }
        to{
            opacity : 1;
            transform : translateX(0px)
        }
    }
`
const SearchBar = styled.div`
    margin : 20px 40px;
`
const Result = styled.div`
    display : flex;
    flex-direction : column;
    overflow-y : scroll;
    height: 78vh;
`
function SearchDrawer() {
  return (
    <Wrapper> 
        <Search>
            <SearchBar>
                <InputA placeholder={"Search"}/>
            </SearchBar>
            <Result>
                <SearchItemCard/>
                <SearchItemCard/>
                <SearchItemCard/>
                <SearchItemCard/>
            </Result>
        </Search>
    </Wrapper>
  )
}

export default SearchDrawer