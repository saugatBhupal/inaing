import React from 'react'
import styled from 'styled-components'
import InputB from '../input/InputB'
import Input from '../input/Input'
import TextArea from '../input/TextArea'
import PriceInput from '../input/PriceInput'
import ColorOption from '../color/ColorOption'
import SizeOption from '../size/SizeOption'
import ButtonB from '../button/ButtonA'
import ImageUploader from './ImageUploader'

const Wrapper = styled.div`
    background-color : #f7f7f7;
    padding :40px;
    max-width : 500px;
    margin : auto;
    button{
        width : 100%;
    }
`
const Form = styled.div`
    
`
const InputSection = styled.div`
    margin : 20px auto;
    a {
        font-size : 14px;
    }
`
const Title = styled.div`
    color : #0f2c56;
`
const ColorOptions = styled.div`
    display : flex;
    margin : 10px auto;
    div{
        margin-right: 8px;
    }
`
function AddProduct() {
  return (
    <Wrapper>
        <Form>
            <Title>Add A New Product</Title>
            <InputSection>
                <InputB label = {"Product Name"}/>
                <InputB label = {"Product Descriptive Name"}/>
                <TextArea label = {"Product Description"}/>
                <PriceInput label = {"Price रु."}/>
                <InputB label = {"Material"}/>
                <a>Color Options</a>
                <ColorOptions>
                    <ColorOption code = {'#c77070'}/>
                    <ColorOption code = {'#5b69ba'}/>
                    <ColorOption code = {'#000000'}/>
                    <ColorOption code = {'#c34b93'}/>
                    <ColorOption code = {'#b3b3b3'}/>
                </ColorOptions>
                <a>Size Options</a>
                <ColorOptions>
                    <SizeOption size ={"S"}/>
                    <SizeOption size ={"M"}/>
                    <SizeOption size ={"L"}/>
                </ColorOptions>
            </InputSection>
            <ImageUploader/>
            <ButtonB text={"Add New Product"}/>
        </Form>
    </Wrapper>
  )
}

export default AddProduct