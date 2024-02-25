import React from 'react'
import styled from 'styled-components'

const Wrapper = styled.div`
    margin : auto;
`
const Container = styled.div`
    border-top : 2px solid #cfd5dd;
    border-bottom : 2px solid #cfd5dd;
    padding : 10px 0;
    display : flex;
    overflow-x : scroll;
    -ms-overflow-style: none;
    scrollbar-width: none;  

    &::-webkit-scrollbar {
        display: none;  
    }
`

const Item = styled.div`
    min-width : fit-content;
    a{
        color:  #0f2c56;
        padding : 10px;
        margin : 10px;
        cursor: pointer;
        transition-duration : 0.2s
    }
    a:hover{
        color : #384b66be;
    }

`
function ApparelType({type}) {
    const types = ['Sailor Striped Shirts', 'Sailor jumpers', 'Jumpers, cardigans, jackets', 'Dresses & Skirts', 'Shirts & blouses', 'Tops & polos', 'Trousers & shorts', 'Coats & Peacoats', 'Shell jackets & Raincoats', 'Accessories']
    return (
        <Wrapper>
            <Container>
                {types.map((item,index)=>(
                    <Item><a key={index}>{item}</a></Item>
                ))}
            </Container>
        </Wrapper>
    )
}

export default ApparelType